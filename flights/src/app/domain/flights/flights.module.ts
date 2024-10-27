import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FlightsRoutingModule } from './flights-routing.module';
import { CreateDailyflightComponent } from './create-dailyflight/create-dailyflight.component';
import { FlightListComponent } from './flight-list/flight-list.component';


@NgModule({
  declarations: [CreateDailyflightComponent,FlightListComponent],
  imports: [
    CommonModule,
    FlightsRoutingModule
  ]
})
export class FlightsModule { }

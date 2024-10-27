import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateDailyflightComponent } from './create-dailyflight/create-dailyflight.component';
import { FlightListComponent } from './flight-list/flight-list.component';

const routes: Routes = [
  { path: 'flight/createdailyflights', component: CreateDailyflightComponent },
  { path: 'flight/flightlist', component: FlightListComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class FlightsRoutingModule { }

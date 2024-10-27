import { Routes } from '@angular/router';
import { CreateflightComponent } from './domain/createflight/createflight.component';

export const routes: Routes = [

    {
        path:'',
        redirectTo:'home',
        pathMatch:'full'
    },
    {
        path:'home',
        component: CreateflightComponent
    },

];

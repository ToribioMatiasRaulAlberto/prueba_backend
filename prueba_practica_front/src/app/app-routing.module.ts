import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BusquedaComponent } from './busqueda/busqueda.component';
import { InformacionComponent } from './informacion/informacion.component';

const routes: Routes = [
  { path: '', component: BusquedaComponent,  pathMatch: 'full'},
  { path: 'informacion-basica', component: InformacionComponent,  pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

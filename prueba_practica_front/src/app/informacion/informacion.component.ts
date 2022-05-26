import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-informacion',
  templateUrl: './informacion.component.html',
  styleUrls: ['./informacion.component.css']
})
export class InformacionComponent implements OnInit {
  public primerNombre = new FormControl({ value: 'Alfredo', disabled: true });
  public segundoNombre = new FormControl({ value: '', disabled: true });
  public primerApellido = new FormControl({ value: 'Pérez', disabled: true });
  public segundoApellido = new FormControl({ value: 'Martínez', disabled: true });
  public telefono = new FormControl({ value: '555123', disabled: true });
  public direccion = new FormControl({ value: 'Calle 20 de Noviembre #23', disabled: true });
  public ciudadResidencia = new FormControl({ value: 'Oaxaca de Juárez', disabled: true });
  
  public formulario = new FormGroup({
    primerNombre: this.primerNombre,
    segundoNombre: this.segundoNombre,
    primerApellido: this.primerApellido, 
    segundoApellido: this.segundoApellido,
    telefono: this.telefono,
    direccion:this.direccion,
    ciudadResidencia: this.ciudadResidencia,
  });
  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  public onSubmit(){
    this.router.navigate(['/'])
  }

}

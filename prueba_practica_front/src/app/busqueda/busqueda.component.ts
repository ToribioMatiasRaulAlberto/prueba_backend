import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-busqueda',
  templateUrl: './busqueda.component.html',
  styleUrls: ['./busqueda.component.css']
})
export class BusquedaComponent implements OnInit {
  
  public documento = new FormControl('', Validators.required);
  public numeroDocumento = new FormControl('',  Validators.compose(
                                                [Validators.required,
                                                  Validators.minLength(8),
                                                  Validators.maxLength(11),
                                                  Validators.pattern('[0-9]*')]));
  
  public formulario = new FormGroup({
    documento: this.documento,
    numeroDocumento: this.numeroDocumento,
  });

  documentos = [
    {id:'C', nombre:"Cédula de ciudadanía"},
    {id:'P', nombre:"Pasaporte"}
  ];
  constructor(private router:Router) {}
  ngOnInit(): void {
  }
  public onSubmit(){
    this.router.navigate(['/informacion-basica'])
  }
}

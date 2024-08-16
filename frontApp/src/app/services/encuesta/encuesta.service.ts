import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EncuestaService {

  private API = "http://localhost:8081/encuesta"
  constructor(
    private httpClient: HttpClient
  ) { }

  public getAllGeneroEncuesta(): Observable<any>{
    return this.httpClient.get(this.API+"/verTodo");
  }

  public countByGenero(): Observable<any>{
    return this.httpClient.get(this.API+"/paraGrafica");
  }

  public saveEncuesta(encuesta:any): Observable<any>{
    return this.httpClient.post<any>(this.API+"/crear",encuesta);
  }

  checkEmail(email: string): Observable<boolean> {
    return this.httpClient.get<boolean>(this.API+"/existe", {
      params: { email }
    });
  }
}


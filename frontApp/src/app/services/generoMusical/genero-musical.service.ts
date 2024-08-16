import { Injectable, ViewEncapsulation } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class GeneroMusicalService {

  private API = "http://localhost:8081/generoMusical"
  constructor(
    private httpClient: HttpClient
  ) { }

  public getAllGeneroMusical(): Observable<any>{
    return this.httpClient.get(this.API+"/verTodo");
  }
}

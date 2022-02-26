import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Books} from "../models/books";

const baseUrl = 'http://localhost:8080/api/books'

@Injectable({
  providedIn: 'root'
})
export class BookServiceService {

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Books[]> {
    return this.http.get<Books[]>(baseUrl);
  }

  get(id: any): Observable<Books> {
    return this.http.get(`${baseUrl}/${id}`);
  }

  create(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }

  update(id: any, data: any): Observable<any> {
    return this.http.put(`${baseUrl}/${id}`, data);
  }

  delete(id: any): Observable<any> {
    return this.http.delete(`${baseUrl}/${id}`);
  }

  deleteAll(): Observable<any> {
    return this.http.delete(baseUrl);
  }

  findBytitle(title: any): Observable<Books[]> {
    console.log(baseUrl+'?title='+title);
    return this.http.get<Books[]>(`${baseUrl}?title=${title}`);
  }

}

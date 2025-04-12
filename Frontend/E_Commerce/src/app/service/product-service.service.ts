import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private apiUrl = 'http://localhost:8080/getAllProducts';  // Change to your API URL

  constructor(private http: HttpClient) {}

  getProducts(category: string): Observable<any[]> {
    const url = category ? `${this.apiUrl}?category=${category}` : this.apiUrl;
    return this.http.get<any[]>(url);
  }
}

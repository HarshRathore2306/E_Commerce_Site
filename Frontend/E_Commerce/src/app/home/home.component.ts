import { Component, NgModule, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../service/product-service.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
// import { ProductService } from './product.service';  // Service to fetch product data

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [ReactiveFormsModule, FormsModule],
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  products: any[] = [];
  categories: string[] = ['Electronics', 'Clothing', 'Books', 'Home'];
  selectedCategory: string = '';
userName: any;

  constructor(private productService: ProductService, private router: Router) {}

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts() {
    this.productService.getProducts(this.selectedCategory).subscribe(
      data => {
        this.products = data;
      },
      error => {
        console.error('Error fetching products:', error);
      }
    );
  }

  addToCart(product: any) {
    console.log('Added to cart:', product);
    // Implement cart functionality here (maybe via a service)
  }

  filterByCategory(category: string) {
    this.selectedCategory = category;
    this.getProducts();
  }

  navigateToAdmin() {
    this.router.navigate(['/admin']);
  }
}

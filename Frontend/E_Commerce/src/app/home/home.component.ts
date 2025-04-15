import { Component, NgModule, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../service/product-service.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgFor } from '@angular/common';
// import { ProductService } from './product.service';  // Service to fetch product data

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [ReactiveFormsModule, FormsModule,NgFor],
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  products = [
    {
      id: 1,
      name: 'Wireless Headphones',
      description: 'Noise cancelling over-ear headphones with rich sound.',
      price: 199.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=Headphones'
    },
    {
      id: 2,
      name: 'Smart Watch',
      description: 'Track fitness, calls, and notifications with this smartwatch.',
      price: 149.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=Smart+Watch'
    },
    {
      id: 3,
      name: 'Gaming Mouse',
      description: 'High precision gaming mouse with RGB lighting.',
      price: 59.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=Gaming+Mouse'
    },
    {
      id: 4,
      name: 'Bluetooth Speaker',
      description: 'Portable speaker with deep bass and long battery life.',
      price: 89.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=Bluetooth+Speaker'
    },
    {
      id: 5,
      name: '4K Monitor',
      description: 'Ultra HD 4K monitor perfect for work and gaming.',
      price: 299.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=4K+Monitor'
    },
    {
      id: 6,
      name: 'Mechanical Keyboard',
      description: 'Tactile mechanical keyboard with customizable RGB lighting.',
      price: 79.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=Keyboard'
    },
    {
      id: 7,
      name: 'Laptop Stand',
      description: 'Ergonomic aluminum stand for laptops up to 17 inches.',
      price: 39.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=Laptop+Stand'
    },
    {
      id: 8,
      name: 'USB-C Hub',
      description: 'Multi-port USB-C hub with HDMI, USB, and SD card reader.',
      price: 49.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=USB-C+Hub'
    },
    {
      id: 9,
      name: 'Smartphone Gimbal',
      description: '3-axis gimbal stabilizer for smooth video shooting.',
      price: 129.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=Gimbal'
    },
    {
      id: 10,
      name: 'Wireless Charger',
      description: 'Fast wireless charger compatible with all Qi-enabled devices.',
      price: 29.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=Wireless+Charger'
    },
    {
      id: 11,
      name: 'Noise Cancelling Earbuds',
      description: 'Compact earbuds with ANC and excellent audio quality.',
      price: 109.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=Earbuds'
    },
    {
      id: 12,
      name: 'Portable SSD 1TB',
      description: 'High-speed portable SSD with USB 3.2 support.',
      price: 149.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=1TB+SSD'
    },
    {
      id: 13,
      name: 'Action Camera',
      description: 'Waterproof 4K action cam with wide-angle lens.',
      price: 179.99,
      imageUrl: 'https://via.placeholder.com/300x200?text=Action+Camera'
    }
  ];
  
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
  
goToCheckout() {
  this.router.navigate(['/cart']);
}
}

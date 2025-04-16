import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgFor } from '@angular/common';

interface CartItem {
  productId: number;
  name: string;
  price: number;
  imageUrl: string;
  quantity: number;
}

@Component({
  selector: 'app-cart',
  imports: [NgFor],
  standalone: true,
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  cartItems: CartItem[] = [];
  total: number = 0;

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.loadCart();
  }

  loadCart(): void {
    this.http.get<CartItem[]>('http://localhost:8080/api/cart') // update URL as needed
      .subscribe(data => {
        this.cartItems = data;
        this.calculateTotal();
      });
  }

  increaseQuantity(item: CartItem): void {
    item.quantity++;
    this.calculateTotal();
  }

  decreaseQuantity(item: CartItem): void {
    item.quantity--;
    if (item.quantity <= 0) {
      this.cartItems = this.cartItems.filter(i => i.productId !== item.productId);
    }
    this.calculateTotal();
  }

  calculateTotal(): void {
    this.total = this.cartItems.reduce((sum, item) => sum + item.price * item.quantity, 0);
  }

  placeOrder(): void {
    // Placeholder: Implement order logic or navigation
    alert('Order Placed Successfully!');
  }

  backToHome(): void {
    // Placeholder: Update to navigate home route
    window.location.href = '/home';
  }
}

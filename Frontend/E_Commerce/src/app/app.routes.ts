import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { CartComponent } from './cart/cart.component';
// import { HomeComponent } from './home/home.component';
// import { RegisterComponent } from './register/register.component'; // you'll create this

export const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'home', component: HomeComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'cart', component: CartComponent },
  { path: '', redirectTo: 'login', pathMatch: 'full' },

];
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { UserService } from '../service/user-service.service';
// import { UserService } from './user.service';  // Service for handling user-related API calls

@Component({
  selector: 'app-register',
  imports: [ReactiveFormsModule],
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm!: FormGroup; // Fixed the error with non-null assertion

  constructor(
    private fb: FormBuilder,
    private userService: UserService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.registerForm = this.fb.group({
      user_Name: ['', [Validators.required, Validators.minLength(3)]],
      user_Email: ['', [Validators.required, Validators.email]],
      user_Password: ['', [Validators.required, Validators.minLength(6)]],
      phone_Number: ['', [Validators.required, Validators.pattern('^[0-9]{10}$')]],
      user_Address: ['', [Validators.required]],
      role: ['', [Validators.required]]
    });
  }

  onSubmit(): void {
    if (this.registerForm.valid) {
      this.userService.createUser(this.registerForm.value).subscribe(
        (response) => {
          console.log('User created successfully:', response);
          this.router.navigate(['/login']); // Redirect to login page
        },
        (error) => {
          console.error('Error creating user:', error);
        }
      );
    } else {
      console.log('Form is invalid');
    }
  }

  onReset(): void {
    this.registerForm.reset();
  }
}

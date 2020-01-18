import { Component, OnInit } from '@angular/core';
import { CustomerService } from './customer.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class EditCustomerComponent implements OnInit {
  customerService: any;

  // tslint:disable-next-line: no-shadowed-variable
  constructor(public CustomerService: customerService,
              private router: Router
    ) { }
  updateProduct(form: NgForm) {
    this.customerService.updateCustomer(form.value).subscribe(res => {
      console.log(res);
      if (res.message === 'updated successfully') {
        this.router.navigateByUrl('/customer');
      }
      form.reset();
    });
  }
  ngOnInit() {
  }
}

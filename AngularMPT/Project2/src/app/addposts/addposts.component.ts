import { Component, OnInit } from '@angular/core';
import { ProductService } from './product.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-posts-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {

  constructor(public productService: ProductService,
              private router: Router
    ) { }
  updateProduct(form: NgForm) {
    this.productService.updateProduct(form.value).subscribe(res => {
      console.log(res);
      if (res.message === 'updated successfully') {
        this.router.navigateByUrl('/products');
      }
      form.reset();
    });
  }
  ngOnInit() {
  }
}

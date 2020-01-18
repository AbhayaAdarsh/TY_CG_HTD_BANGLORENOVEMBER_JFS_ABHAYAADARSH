import { Component, OnInit } from '@angular/core';
import { ProductService } from './product.component.spec';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  message: string;
  products: ProductsComponent [];
  constructor(private productService: ProductService,
              private router: Router) {
    this.getProducts();
  }

  getProducts() {
    this.productService.getData().subscribe(response => {
      console.log(response);
      this.products = response.products;
    }, err => {
      console.log(err);
    });
  }

  deleteProduct(product: ProductsComponent) {
    this.productService.deleteData(product).subscribe(res => {
      console.log(res);
      if (res.message === 'delete successfully') {
        this.products.splice(this.products.indexOf(product),1);
        this.message = res.message;
      }
    });
  }

  deleteMessage() {
    this.message = null;
  }
  selectProduct(product: ProductsComponent) {
    this.productService.selectedProductComponent = product;
    this.router.navigateByUrl('/updateProduct');
  }
  ngOnInit() {
  }
}

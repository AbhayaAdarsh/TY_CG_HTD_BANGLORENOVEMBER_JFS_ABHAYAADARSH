import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CustomersComponent } from './customers/customers.component';
import { ProductComponent } from './product/product.component';
import { LoginComponent } from './login/login.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { AddcustomerComponent } from './addcustomer/addcustomer.component';
import { DataFromJsonComponent } from './data-from-json/data-from-json.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CustomersComponent,
    ProductComponent,
    LoginComponent,
    PagenotfoundComponent,
    AddcustomerComponent,
    DataFromJsonComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [
  ]
})
export class AppModule { }

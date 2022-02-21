@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    FooComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
     { path: '', component: HomeComponent, pathMatch: 'full' }], {onSameUrlNavigation: 'reload'})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

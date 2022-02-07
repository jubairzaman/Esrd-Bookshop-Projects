import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from "./components/home/home.component";
import {AuthorListComponent} from "./components/author-list/author-list.component";
import {AddAuthorComponent} from "./components/add-author/add-author.component";
import {AuthorDetailsComponent} from "./components/author-details/author-details.component";
import {AuthorUpdateComponent} from "./components/author-update/author-update.component";

const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'author-list', component: AuthorListComponent},
  {path: 'add-author', component: AddAuthorComponent},
  {path: 'author-details/:id', component: AuthorDetailsComponent},
  {path: 'update-author/:id', component: AuthorUpdateComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

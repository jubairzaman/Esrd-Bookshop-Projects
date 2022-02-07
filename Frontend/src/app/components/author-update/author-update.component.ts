import {Component, OnInit} from '@angular/core';
import {Author} from "../../models/author";
import {AuthorServicesService} from "../../services/author-services.service";
import {ActivatedRoute, Params, Router} from "@angular/router";

@Component({
  selector: 'app-author-update',
  templateUrl: './author-update.component.html',
  styleUrls: ['./author-update.component.css']
})
export class AuthorUpdateComponent implements OnInit {
  genres = [
    'Drama',
    'Fiction',
    'Horror',
    'Sci-fi',
    'Romance',
    'Dystopian Future',
    'Comic Books',
  ];

  selected_genres?: string[];

  id?: string;
  author = new Author();
  submitted = false;

  constructor(private authorService: AuthorServicesService, private route: ActivatedRoute, private router: Router) {
  }

  ngOnInit(): void {
    this.author = new Author()

    this.route.params.subscribe(
      (params: Params) => {
        this.id = params['id'.toString()];
        this.authorService.get(this.id)
          .subscribe({
            next: (data) => {
              this.author = data;
              this.selected_genres = this.author.genre
              console.log(data);
            },
            error: (e) => console.error(e)
          });
      }
    );
  }

  print(): void {
    console.log(this.selected_genres)
  }

  updateAuthor(): void {
    if (confirm('Update this author?')) {
      const data = {
        name: this.author.name,
        age: this.author.age,
        email: this.author.email,
        phone: this.author.phone,
        genre: this.selected_genres
      };

      this.authorService.update(this.id, data)
        .subscribe({
          next: (res) => {
            console.log(res);
            this.submitted = true;
          },
          error: (e) => console.error(e)
        });
    }
  }
}

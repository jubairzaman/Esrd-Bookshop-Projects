import {Component, OnInit} from '@angular/core';
import {Author} from "../../models/author";
import {AuthorServicesService} from "../../services/author-services.service";

@Component({
  selector: 'app-add-author',
  templateUrl: './add-author.component.html',
  styleUrls: ['./add-author.component.css']
})
export class AddAuthorComponent implements OnInit {
  genres = [
    'Drama',
    'Fiction',
    'Horror',
    'Sci-fi',
    'Romance',
    'Dystopian Future',
    'Comic Books',
  ];

  selected_genres?: [];

  author: Author = {
    name: '',
    age: 0,
    email: '',
    phone: '',
    genre: []
  };
  submitted = false;

  constructor(private authorService: AuthorServicesService) {
  }

  ngOnInit(): void {
  }

  print(): void {
    console.log(this.selected_genres)
  }

  saveAuthor(): void {
    const data = {
      name: this.author.name,
      age: this.author.age,
      email: this.author.email,
      phone: this.author.phone,
      genre: this.selected_genres
    };

    this.authorService.create(data)
      .subscribe({
        next: (result) => {
          console.log(result);
          this.submitted = true;
        },
        error: (e) => console.error(e)
      });
  }

  newAuthor(): void {
    this.submitted = false;
    this.author = {
      name: '',
      age: 0,
      email: '',
      phone: '',
      genre: []
    };
    this.selected_genres=[];
  }

}

import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Movie } from './movie';
import { MovieService } from './movie.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  public movies: Movie[] | undefined;
  public editMovie: Movie | undefined | null;
  public deleteMovie: Movie | undefined | null;

  constructor(private movieService: MovieService){}

  ngOnInit(): void {
    this.getMovies();
  }

  public getMovies(): void{
    this.movieService.getMovies().subscribe(
      (response: Movie[]) => {
        this.movies = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public onAddMovie(addForm: NgForm): void{
    document.getElementById('add-movie-form')?.click();
    this.movieService.addMovie(addForm.value).subscribe(
      (response: Movie) => {
        console.log(response);
        this.getMovies();
        addForm.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      } 
    );
  }

  public onUpdateMovie(movie: Movie): void{
    this.movieService.updateMovie(movie).subscribe(
      (response: Movie) => {
        console.log(response);
        this.getMovies();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      } 
    );
  }

  public onDeleteMovie(movieId: number | undefined): void{
    this.movieService.deleteMovie(movieId).subscribe(
      (response: void) => {
        console.log(response);
        this.getMovies();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      } 
    );
  }

  public onOpenModal(movie: Movie | null, mode: string): void { // add | null to Movie if it breaks
    const container = document.getElementById('main-container');
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');
    if (mode === 'add'){
      button.setAttribute('data-target', '#addMovieModal');
    }
    if (mode === 'edit'){
      this.editMovie = movie;
      button.setAttribute('data-target', '#updateMovieModal');
    }
    if (mode === 'delete'){
      this.deleteMovie = movie;
      button.setAttribute('data-target', '#deleteMovieModal');
    }
    container?.appendChild(button);
    button.click();
  }

}

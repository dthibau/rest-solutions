import { Component, OnInit } from '@angular/core';
import { MediaService, Medium } from '../core/api/v1';

@Component({
  selector: 'app-media-list',
  templateUrl: './media-list.component.html',
  styleUrls: ['./media-list.component.css']
})
export class MediaListComponent implements OnInit {

  medias: Medium[]

  constructor(private mediaService: MediaService) { }

  ngOnInit() {
    this.mediaService.find().subscribe(res => this.medias = res)
  }

}

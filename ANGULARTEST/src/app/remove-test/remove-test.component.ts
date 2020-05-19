import { Component, OnInit } from '@angular/core';
import { DiagnosticCentre, HttpClientService } from '../service.service';

@Component({
  selector: 'app-remove-test',
  templateUrl: './remove-test.component.html',
  styleUrls: ['./remove-test.component.css']
})
export class RemoveTestComponent implements OnInit {
  user: DiagnosticCentre = new DiagnosticCentre("","", "");
  diagnosticCentres:DiagnosticCentre[];

  constructor(private httpClientService:HttpClientService) { }

  ngOnInit(): void {
  }
  deleteTest(user: DiagnosticCentre): void {
    console.log(user);
    this.httpClientService.deleteTest(user.testId)
      .subscribe( data => {
        alert("Test removed successfully.");
      })
  }

}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class DiagnosticCentre {
  constructor(
    public centreId: string,
    public centreName:string,
    public testName:string,
    public testId: String
  ) {}
}
@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(
    private httpClient:HttpClient
  ) { 
     }
     getCentres()
     {
       console.log("test call");
       //To populate the data in delete page
       return this.httpClient.get<any[]>("http://localhost:2080/Test/find");
     }
  public deleteTest(testId) {
    debugger;
    console.log(testId);
    return this.httpClient.delete<DiagnosticCentre>("http://localhost:2080/Test/delete/"+ testId);
    
  }
  public createTest(diagnosticCentre) {
    debugger;
    const dataToSend: any = {
  
        "testName": diagnosticCentre.testName,
        "centre":{
          "centreName":diagnosticCentre.centreName
        }
        
    };
    return this.httpClient.post<any>("http://localhost:2080/Test/create", dataToSend);
    
  }
  
  public getCenterNames(){
    return this.httpClient.get<any>("http://localhost:2080/Test/findCentre");
   // add dropdown

  }
}
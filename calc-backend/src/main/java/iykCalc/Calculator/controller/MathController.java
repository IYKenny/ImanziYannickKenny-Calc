package iykCalc.Calculator.controller;

import iykCalc.Calculator.InvalidOperationException;
import iykCalc.Calculator.services.MathOperatorImpl;
import iykCalc.Calculator.utils.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import iykCalc.Calculator.dto.DoMathRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class MathController {

    @Autowired
    MathOperatorImpl mathOp;

    @PostMapping("/doMath")
    public ResponseEntity doMath(@RequestBody DoMathRequest dto) throws InvalidOperationException {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new JsonResponse(true, mathOp.doMath(dto.getOperand1(), dto.getOperand2(), dto.getOperation())));
    }
}
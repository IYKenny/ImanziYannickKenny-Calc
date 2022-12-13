
import React, {useEffect, useState, useRef} from 'react';
import axios from 'axios';

export default function Calculator(){

    
    return(
        <>
<div className="inpt-cont mb-4">
<select required name="" id="" className='form-select py-3 shadow-none'>
<option disabled value="" selected>Choose the operator</option>
<option value="+">+ (Add)</option>
<option value="-">- (Subtract)</option>
<option value="*">* (Multiply)</option>
<option value="/">/ (Divide)</option>
<option value="**">^ (Power)</option>
<option value="log">Log (Log 10)</option>
<option value="ln">Ln (Log e)</option>
</select>
</div>
                
        </>
    )
}
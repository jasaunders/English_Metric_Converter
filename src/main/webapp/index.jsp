<%@include file="head.jsp"%>
<html>
    <head>

        <script type="text/javascript">

                function populate(s1, s2) {
                    var newS1 = document.getElementById(s1);
                    var newS2 = document.getElementById(s2);
                    newS2.innerHTML = "";
                    if (s2 === "afterLengthConversion")
                        var optionArray = ["|", "inches|Inches", "feet|Feet", "yards|Yards", "miles|Miles",
                                "mm|Millimeters", "cm|Centimeters", "meters|Meters", "km|Kilometers"];
                    if (s2 === "afterVolumeConversion")
                         optionArray = ["|", "ozfl|Fluid Ounces", "tsp|Teaspoons", "tbsp|Tablespoons", "cups|Cups",
                            "ml|Milliliters", "liters|Liters"];
                    if (s2 === "afterWeightConversion")
                         optionArray = ["|", "oz|Ounces", "lbs|Pounds", "grains|Grains", "tons|Short Tons",
                            "grams|Grams", "kilos|Kilograms"];
                    for(var option in optionArray) {
                        var pair = optionArray[option].split("|");
                        var newOption = document.createElement("option");
                        newOption.value = pair[0];
                        newOption.innerHTML = pair[1];
                        if (newS1.value !== newOption.value)
                            newS2.options.add(newOption);
                    }
                }
        </script>
        <Style>
            .section-header {background-color: aqua;
                border-left: 6px solid aquamarine}
            h1 {color:aquamarine}
            h5 {color: blue}

        </Style>
    </head>
<body>

<div class="container">


    <div>
        <div class="col-sm-3"></div>
        <div class="col-sm-6">
            <h1>English Metric Converter</h1>
            <h5> Convert any English or Metric unit to another unit quickly and easily. Data is available in plain text, html and JSON format.</h5>


            <div>
                <h2 class="section-header">Length Converter</h2>

                <h3> Description: </h3>

                <p>Convert any length to another unit by providing the input Unit, output Unit and quantity to convert.</p>

                <h3>API call:</h3>

                <p>http://18.216.71.249:8080/English_Metric_Converter/services/length/{response_type}/{input_units}/{output_units}/{quantity}</p>


                <h3>  Parameters:</h3>

                <ul>
                    <li> <strong>response_type</strong> format of the output data requested.</li>
                    <li> <strong>input_units</strong> unit of measure to be converted.</li>
                    <li> <strong>output_units</strong> unit of measure to be returned in the response.</li>
                    <li> <strong>quantity</strong> the number of units to be converted.</li>
                </ul>

                <h3> Exmaples of API calls:</h3>

                <p>http://18.216.71.249:8080/English_Metric_Converter/services/length/json/inches/feet/12</p>

                <h3> Example of API response:</h3>

                <pre> { "inUnit" : "inches",
"outUnit" : "feet",
"quantity" : 12.0,
"convertedQuantity" : 1.0
}
                </pre>

                <h3> Parameters:</h3>

                <p> <code>input_units</code> The unit of measure to be converted. </p>
                <p> <code>output_units</code> The unit of measure that input units will be converted to.</p>
                <p> <code>quantity</code> The number of units to be convert.</p>
                <p> <code>converted_quantity</code> The equivalent number of output units.</p>

                <h5> Use the following abbreviations for input and output units when submitting a request:</h5>

                <div>

                    <table class="table-striped table-bordered table-condensed table-responsive">

                        <tr class="column-header-background">
                            <th class="column-header">Abbreviation</th>
                            <th class="column-header">Unit Description</th>
                        </tr>
                        <tr>
                            <td>inches</td>
                            <td>inches</td>
                        </tr>
                        <tr>
                            <td>feet</td>
                            <td>feet</td>
                        </tr>
                        <tr>
                            <td>yards</td>
                            <td>yards</td>
                        </tr>
                        <tr>
                            <td>miles</td>
                            <td>miles</td>
                        </tr>
                        <tr>
                            <td>mm</td>
                            <td>millimeters</td>
                        </tr>
                        <tr>
                            <td>cm</td>
                            <td>centimeters</td>
                        </tr>
                        <tr>
                            <td>meters</td>
                            <td>meters</td>
                        </tr>
                        <tr>
                            <td>km</td>
                            <td>kilometers</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div>
                <h2 class="section-header">Weight Converter</h2>

                <h3> Description: </h3>

                <p>Convert any weight to another unit by providing the input Unit, output Unit and quantity to convert.</p>

                <h3>API call:</h3>

                <p>http://18.216.71.249:8080/English_Metric_Converter/services/weight/{response_type}/{input_units}/{output_units}/{quantity}</p>


                <h3>  Parameters:</h3>

                <ul>
                    <li> <strong>response_type</strong> format of the output data requested.</li>
                    <li> <strong>input_units</strong> unit of measure to be converted.</li>
                    <li> <strong>output_units</strong> unit of measure to be returned in the response.</li>
                    <li> <strong>quantity</strong> the number of units to be converted.</li>
                </ul>

                <h3> Exmaples of API calls:</h3>

                <p>http://18.216.71.249:8080/English_Metric_Converter/services/weight/json/oz/lbs/12</p>

                <h3> Example of API response:</h3>

                <pre> { "inUnit" : "oz",
"outUnit" : "lbs",
"quantity" : 12.0,
"convertedQuantity" : 0.75
}
                </pre>

                <h3> Parameters:</h3>

                <p> <code>input_units</code> The unit of measure to be converted. </p>
                <p> <code>output_units</code> The unit of measure that input units will be converted to.</p>
                <p> <code>quantity</code> The number of units to be convert.</p>
                <p> <code>converted_quantity</code> The equivalent number of output units.</p>

                <h5> Use the following abbreviations for input and output units when submitting a request:</h5>

                <div>

                    <table class="table-striped table-bordered table-condensed table-responsive">

                        <tr class="column-header-background">
                            <th class="column-header">Abbreviation</th>
                            <th class="column-header">Unit Description</th>
                        </tr>
                        <tr>
                            <td>oz</td>
                            <td>ounces</td>
                        </tr>
                        <tr>
                            <td>lbs</td>
                            <td>pounds</td>
                        </tr>
                        <tr>
                            <td>grains</td>
                            <td>grains</td>
                        </tr>
                        <tr>
                            <td>tons</td>
                            <td>tons</td>
                        </tr>

                        <tr>
                            <td>grams</td>
                            <td>grams</td>
                        </tr>
                        <tr>
                            <td>kilos</td>
                            <td>kilograms</td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <div class="col-sm-3"></div>
        <div class="col-sm-3"></div>

        <div class="col-sm-6" style="background-color:lavenderblush;">
            <h2>Measurement Converters</h2>
            <form method="GET" class="form-inline" id="getForm">

                <div class="radio">
                    <label><input type="radio" name="optOutput" value="text" checked>Text</label>
                </div>
                <div class="radio">
                    <label><input type="radio" name="optOutput" value="html">HTML</label>
                </div>
                <div class="radio">
                    <label><input type="radio" name="optOutput" value="json">JSON</label>
                </div>

            <h3>Length</h3>

                <label for="beforeLengthConversion">Choose Units</label>
                <select id="beforeLengthConversion" name="beforeLengthConversion"  onchange="populate(this.id, 'afterLengthConversion')">
                    <option value=""></option>
                    <option value="inches">Inches</option>
                    <option value="feet">Feet</option>
                    <option value="yards">Yards</option>
                    <option value="miles">Miles</option>
                    <option value="mm">Millimeters</option>
                    <option value="cm">Centimeters</option>
                    <option value="meters">Meters</option>
                    <option value="km">Kilometers</option>
                </select>

                <div class="form-group">
                    <label for="searchLength">Value</label>
                    <input type="text" class="form-control" id="searchLength" name="searchLength"
                           aria-describedby="searchLengthHelp" placeholder="Enter value of measurement.">
                </div>

                <label for="afterLengthConversion">Change To New Units</label>
                <select id="afterLengthConversion" name="afterLengthConversion">
                </select>

                <button type="submit" id="submitLength" name="submit" value="search" class="btn btn-primary">Search</button>

            <h3>Volume</h3>

                <label for="beforeVolumeConversion">Choose Units</label>
                <select id="beforeVolumeConversion" name="beforeVolumeConversion" onchange="populate(this.id, 'afterVolumeConversion')">
                    <option value=""></option>
                    <option value="ozfl">Fluid Ounces</option>
                    <option value="tsp">Teaspoons</option>
                    <option value="tbsp">Tablespoons</option>
                    <option value="cups">Cups</option>
                    <option value="ml">Milliliters</option>
                    <option value="liters">Liters</option>
                </select>

                <div class="form-group">
                    <label for="searchVolume">Value</label>
                    <input type="text" class="form-control" id="searchVolume" name="searchVolume" aria-describedby="searchTermHelp" placeholder="Enter value of measurement.">
                </div>

                <label for="afterVolumeConversion">Change To New Units</label>
                <select id="afterVolumeConversion" name="afterLengthConversion">
                </select>
                <button type="submit" id="submitVolume" name="submit" value="search" class="btn btn-primary">Search</button>

            <h3>Weight</h3>

                <label for="beforeWeightConversion">Choose Units</label>
                <select id="beforeWeightConversion" name="beforeWeightConversion" onchange="populate(this.id, 'afterWeightConversion')">
                    <option value=""></option>
                    <option value="oz">Ounces</option>
                    <option value="lbs">Pounds</option>
                    <option value="grains">Grains</option>
                    <option value="tons">Short Tons</option>
                    <option value="grams">Grams</option>
                    <option value="kilos">Kilograms</option>
                </select>

                <div class="form-group">
                    <label for="searchWeight">Value</label>
                    <input type="text" class="form-control" id="searchWeight" name="searchWeight" aria-describedby="searchWeightHelp" placeholder="Enter value of measurement.">
                </div>

                <label for="afterWeightConversion">Change To New Units</label>
                <select id="afterWeightConversion" name="afterWeightConversion">
                </select>

                <button type="submit" id="submitWeight" name="submit" value="search" class="btn btn-primary">Search</button>

                <h3>Results</h3>
                <div class="form-group">
                    <label for="converterResult">Conversion Result</label>
                    <input type="text" id="converterResult" name="converterResult"></input>
                </div>
            </form>


        </div>
        <div class="col-sm-3"></div>
    </div>
</div>
</body>
</html>
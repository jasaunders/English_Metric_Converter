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
    </head>
<body>

<div>


    <div>
        <div class="col-sm-3"></div>

        <div class="col-sm-6" style="background-color:lavenderblush;">
            <h2>Measurement Converters</h2>
            <form action="converter/services/" method="GET" class="form-inline">
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

                <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
            <!--</form> -->

            <h3>Volume</h3>
            <!-- <form id="beforeVol" class="form-inline"> -->

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
                <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
            <!--</form>-->

            <h3>Weight</h3>
            <!--<form id="beforeWgt" class="form-inline">-->

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

                <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>

                <label for="converterResult">Conversion Result</label>
                <text id="converterResult" name="converterResult"></text>
            </form>


        </div>
        <div class="col-sm-3"></div>
    </div>
</div>
</body>
</html>
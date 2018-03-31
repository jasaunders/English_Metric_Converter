<%@include file="head.jsp"%>
<html>
<body>
<h2>Measurement Converters</h2>

<h3>Length</h3>
<form action="beforeLength" id="beforeLen" class="form-inline">

    <select name="beforeLengthConversion">
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
        <input type="text" class="form-control" id="searchLength" name="searchLength" aria-describedby="searchLengthHelp" placeholder="Enter value of measurement.">
    </div>

    <select name="afterLengthLength">
        <option value="feet">Feet</option>
        <option value="yards">Yards</option>
        <option value="miles">Miles</option>
        <option value="mm">Millimeters</option>
        <option value="cm">Centimeters</option>
        <option value="meters">Meters</option>
        <option value="km">Kilometers</option>
    </select>

    <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
</form>

<h3>Volume</h3>
<form action="beforeVolume" id="beforeVol" class="form-inline">

    <select name="beforeVolumeConversion">
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

    <select name="beforeVolumeConversion">
        <option value="ozfl">Fluid Ounces</option>
        <option value="tsp">Teaspoons</option>
        <option value="tbsp">Tablespoons</option>
        <option value="cups">Cups</option>
        <option value="ml">Milliliters</option>
        <option value="liters">Liters</option>
    </select>

    <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
</form>

<h3>Weight</h3>
<form action="beforeWeight" id="beforeWgt" class="form-inline">

    <select name="beforeWeightConversion">
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

    <select name="afterWeightConversion">
        <option value="oz">Ounces</option>
        <option value="lbs">Pounds</option>
        <option value="grains">Grains</option>
        <option value="tons">Short Tons</option>
        <option value="grams">Grams</option>
        <option value="kilos">Kilograms</option>
    </select>

    <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
</form>

</body>
</html>

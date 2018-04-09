
$(document).ready(function() {

    //get the fields
    //response type
    var responseType = $('input[name="optOutput"]:checked').val();
    console.log("type of response: " + responseType);
    //inUnits
    var inUnits = $('#beforeLengthConversion').val();
    console.log("inUnits: " + inUnits);
    //outUnits
    var outUnits = $('#afterLengthConversion').val();
    console.log("outUnits: " + outUnits);
    //inQuantity
    var inQuantity = $('#searchLength').val();
    console.log("inQuantity: " + inQuantity);

    var form = $('#getForm').action('http://18.216.71.249:8080/English_Metric_Converter/services/');
    console.log("got past get form statement");

    // get the button, and set the form action. submit the form
    document.getElementById('submitLength').onclick = function () {

        form.action += "length/" + responseType + "/" + inUnits + "/" + outUnits + "/" + inQuantity;
        form.submit();
        console.log("got to end of javascript function");
    }

    document.getElementById('submitVolume').onclick = function () {

        form.action += "volume/" + responseType + "/" + inUnits + "/" + outUnits + "/" + inQuantity;
        form.submit();
    }

    document.getElementById('submitWeight').onclick = function () {

        form.action += "weight/" + responseType + "/" + inUnits + "/" + outUnits + "/" + inQuantity;
        form.submit();

    }

})






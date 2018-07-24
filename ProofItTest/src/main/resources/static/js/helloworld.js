$(function () {
    $('#submithello').on('click', function () {
        var nameinput = $('#nameinput')[0].value;

        $.get('/rest/helloworld?username=' + nameinput, function (result) {
            $('#helloText').text(result);
        });
    });
});
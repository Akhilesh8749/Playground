$(document).ready(function() {
    var d_canvas = document.getElementById('canvas');
    var context = d_canvas.getContext('2d');
    var background = document.getElementById('background');
    var pod = document.getElementById('podID');

    context.drawImage(background, 0, 0);
    $('#valueX').text(00);
    $('#valueY').text(00);
    $("#draw").attr("disabled", true);

    // $('#addPOD').click(function(){
    //     context.drawImage(pod,200,200);
    // });

    $('#podID').draggable();

    $('#draw').click(function() {
        var $pod = $('#podID');
        var $canvas = $('#canvas');
        var pod_x = $pod.offset().left - $canvas.offset().left;
        var pod_y = $pod.offset().top - $canvas.offset().top;

        context.drawImage(pod, pod_x, pod_y);
        $('#valueX').text(pod_x);
        $('#valueY').text(pod_y);
        
        $pod.hide();
        $(this).attr('disabled', 'disabled');
    });

});
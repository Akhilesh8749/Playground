$(document).ready(function() {
    var d_canvas = document.getElementById('canvas');
    var context = d_canvas.getContext('2d');
    var background = document.getElementById('background');
    var pod = document.getElementById('pod');
    var reset = document.getElementById('reset')
    context.drawImage(background, 0, 0);
    

    $('#pod').draggable();

    $('#draw').click(function() {
        var $pod = $('#pod');
        var $canvas = $('#canvas');
        var $reset = $('#reset')
        var pod_x = $pod.offset().left - $canvas.offset().left;
        var pod_y = $pod.offset().top - $canvas.offset().top;

        context.drawImage(pod, pod_x, pod_y);
        
        $pod.hide();
        $(this).attr('disabled', 'disabled');

        $reset.reset();
    });
});
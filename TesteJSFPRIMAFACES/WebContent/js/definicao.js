var activeEl = 2;
$(function() {
    var items = $('.btn-nav');
    $( items[activeEl] ).addClass('active');
    $( ".btn-nav" ).click(function() {
        $( items[activeEl] ).removeClass('active');
        $( this ).addClass('active');
        activeEl = $( ".btn-nav" ).index( this );
    });
});



function demo_callback_function($el, value, callback) {
  callback({
    value: value,
    valid: /a.*z/.test(value),
    message: "Must start with 'a' and end with 'z'"
  });
}

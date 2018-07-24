$(function () {
    $.get('/rest/todos', function (todos) {
        $('#todos tbody').empty();
        for (let i = 0; i < todos.length; i++) {
            var todo = todos[i];
            $tr = createTrFromTodo(todo);
            $('#todos tbody').append($tr);
        }
    });
    $('#submittodo').on('click', function (e) {
        e.preventDefault();
        var todo = {};
        todo.task = $('#todoinput').val();
        $.ajax({type: "POST",
            url: "/rest/todos",
            contentType: 'application/json',
            async: true,
            data: JSON.stringify(todo),
            success: function (todo) {
                $tr = createTrFromTodo(todo);
                $('#todos tbody').append($tr);
                todo.task = $('#todoinput').val('');
                //}


            }

        });
    });
    $('.table').on('click', '.deleterow', function (e) {
        e.preventDefault();

        let buttonId = $(this).attr('id');
        let tr = $(this).parents('tr').get(0);

        $.ajax({
            type: "DELETE",
            url: '/rest/todos/' + buttonId.replace('del', ''),
            contentType: 'application/json',
            async: true,
            success: function () {
                tr.remove();
            }
        });
    });
});
function createTrFromTodo(todo) {
    var $task = $('<td></td>').text(todo.task);
    var $createdAt = $('<td></td>').text(todo.createdAt);
    var $delete = $('<td><button id="del' + todo.id + '" class="btn btn-danger btn-small deleterow">Törlés</button></td>');
    var $tr = $('<tr></tr>').append($task).append($createdAt).append($delete);
    return $tr;
}
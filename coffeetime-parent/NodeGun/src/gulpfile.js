/**
 * Created by mrseasons on 16/3/18.
 */
var gulp = require('gulp');

// 默认任务
gulp.task('default', function () {
    console.log('start gulp')
});

// 自定义任务
gulp.task("foobar", function () {
    console.log('start custom task')

    gulp.src("./*.js")
        .pipe(gulp.dest("../outputs/dist"));
});
var gulp = require('gulp');
var babel = require('gulp-babel');

const es6 = {
    src: 'es6/*.js',
    dest: 'es5_dir'
};

gulp.task('babel', function () {
    return gulp.src(es6.src)
        .pipe(babel())
        .pipe(gulp.dest(es6.dest))
});
gulp.task('watch', function () {
    gulp.watch(es6.src, ['babel']);
});
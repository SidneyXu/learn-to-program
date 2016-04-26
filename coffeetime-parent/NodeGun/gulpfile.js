var gulp = require('gulp');
var babel = require('gulp-babel');
var react = require('gulp-react');
var less = require('gulp-less');
var sass = require('gulp-sass');
var mocha = require('gulp-mocha');
var browserify = require('gulp-browserify');
var uglify = require('gulp-uglify');

const es6 = {
    src: 'es6/*.js',
    dest: 'es5_dir'
};

// ES6 and React
gulp.task('babel', function () {
    return gulp.src(es6.src)
        .pipe(react())
        .pipe(babel())
        .pipe(gulp.dest(es6.dest))
});
gulp.task('watch', function () {
    gulp.watch(es6.src, ['babel']);
});

// Default task
gulp.task('default', function () {
    console.log('default task');
});

// Combine tasks
gulp.task('one', function () {
   console.log('one');
});
gulp.task('two', function () {
    console.log('two');
});
gulp.task('mytask', ['one', 'two'], function () {
    console.log('end mytask');
});

// Less and Sass
gulp.task('less', function () {
    return gulp.src('style/*.less')
        .pipe(less())
        .pipe(gulp.dest(es6.dest))
});
gulp.task('sass', function () {
    return gulp.src('style/*.scss')
        .pipe(sass())
        .pipe(gulp.dest(es6.dest))
});
gulp.task('style', ['less', 'sass']);

// Mocha
gulp.task('mocha-test', function () {
    return gulp.src('test/*.js')
        .pipe(mocha());
});

// browserify and uglify
gulp.task('browserify', function () {
    return gulp.src('main.js')
        .pipe(browserify())
        .pipe(uglify())
        .pipe(gulp.dest('./outputs'));
});


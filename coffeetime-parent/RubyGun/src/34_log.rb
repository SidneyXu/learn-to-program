def c
  puts "I'm in C. You know who called me?"
  puts caller
end

def b
  c
end

def a
  b
end

a

# Logging
require 'logger'
logger = Logger.new($stdout)
logger.warn('This is a warning')
logger.info('This is an info')

logger.level = Logger::INFO
logger.debug('(INFO) This a debug message')
logger.unknown('(INFO) Something unknown. Oh, mystery and suspense!')
logger.error('(INFO) Error! Run! Panic!')
logger.warn('(INFO) This is a warning.')

# Benchmark
require 'benchmark'

puts Benchmark.measure { 602214.times { 3.14159 * 6.626068 } }

n=4000
Benchmark.bm do |benchmark|
  benchmark.report do
    a=[]; n.times { a = a + [n] }
  end
  benchmark.report do
    a=[]; n.times { a << n }
  end
  benchmark.report do
    a=[1..n].map { |number| number }
  end
end
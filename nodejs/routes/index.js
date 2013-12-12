
/*
 * GET home page.
 */

exports.index = function(req, res){
  console.log('exports.index');
  res.render('index', { title: 'Express' });
};
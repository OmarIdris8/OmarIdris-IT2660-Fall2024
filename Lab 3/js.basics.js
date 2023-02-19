/* ============ */
/* Examples     */
/* ============ */

function addExample()
{
   alert(5 + 7);
}

function multiplyExample()
{
   alert(5 * 7);
}

function makeVariables()
{
   var spam = "Spam in a can";
   alert(spam);
}

function simpleIf()
{
   var temp = 72;

   if(temp > 85)
   {
      alert("It's hot outside!");
   }
   else if(temp > 65)
   {
      alert("It's warm outside!");
   }
   else if(temp > 50)
   {
      alert("It's cool outside!");
   }
   else
   {
      alert("It's cold outside!");
   }
}

function switchStatements()
{
   var temp = 72;

   switch(temp)
   {
      case 90:
         alert("It's hot outside!");
         break;
      case 72:
         alert("It's warm outside!");
         break;
      default:
         alert("It's some temperature outside!");
   }
}

function threeLoops()
{
   var count = 1;

   while(count <= 10)
   {
      if(count == 5)
      {
         alert("Hello! First time.");
      }
      count = count + 1;
   }

   count = 1;

   do
   {
      if(count == 5)
      {
         alert("Hello! Second time.");
      }
      count = count + 1;
   } while(count <= 10);

   for(var count = 1; count <= 10; count++)
   {
      if(count == 5)
      {
         alert("Hello! Third time.");
      }
   }
}

/* ============ */
/* Lab Problems */
/* ============ */

function problem01()
{
   alert(5 - 7);
}

function problem02()
{
   alert(7 / 5);
}

function problem03()
{
    var eggs = "42";
    alert(eggs);
 }

function problem04()
{
    var grade = 97;
 
    if(grade >= 90)
    {
       alert("A");
    }
    else if(grade >= 80)
    {
       alert("B");
    }
    else if(grade >= 70)
    {
       alert("C");
    }
    else if(grade >= 60)
    {
        alert("D");
    }
    else
    {
       alert("F");
    }
 }

function problem05()
{
   for(var count = 0; count < 100; count++)
   {
      if(count == 42)
      {
         alert("42!");
      }
   }
}
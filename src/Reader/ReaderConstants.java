/* Generated By:JavaCC: Do not edit this line. ReaderConstants.java */
package Reader;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ReaderConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int NUM = 5;
  /** RegularExpression Id. */
  int ID = 6;
  /** RegularExpression Id. */
  int LETTER = 7;
  /** RegularExpression Id. */
  int DIGIT = 8;
  /** RegularExpression Id. */
  int P_OUVERT = 9;
  /** RegularExpression Id. */
  int C_OUVERT = 10;
  /** RegularExpression Id. */
  int C_FERME = 11;
  /** RegularExpression Id. */
  int P_FERME = 12;
  /** RegularExpression Id. */
  int FLECHE = 13;
  /** RegularExpression Id. */
  int SEPARATEUR = 14;
  /** RegularExpression Id. */
  int HASHTAG = 15;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "<NUM>",
    "<ID>",
    "<LETTER>",
    "<DIGIT>",
    "<P_OUVERT>",
    "\"[\"",
    "\"]\"",
    "<P_FERME>",
    "\"->\"",
    "<SEPARATEUR>",
    "\"#\"",
  };

}
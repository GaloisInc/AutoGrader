package ie.ucd.autograder.views;

import net.sourceforge.nattable.data.IDataProvider;

public class AutoGraderColumnHeaderDataProvider implements IDataProvider {

  private final AutoGraderDataProvider dataProvider;
  
  public AutoGraderColumnHeaderDataProvider(AutoGraderDataProvider dataProvider) {
    this.dataProvider = dataProvider;
  }

  public int getColumnCount() {
//    System.out.println("Column header column count: " + dataProvider.getColumnCount());
    return dataProvider.getColumnCount();
  }

  public Object getDataValue(int columnIndex, int rowIndex) {
//    System.out.println("Getting header value for col=" + columnIndex + ", row=" + rowIndex);
    return dataProvider.getColumnHeader(columnIndex);
  }

  public int getRowCount() {
//    System.out.println("Getting column header row count (1)");
    return 1;
  }

  public void setDataValue(int columnIndex, int rowIndex, Object newValue) {
    //Do nothing.
  }

}
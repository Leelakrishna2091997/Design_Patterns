package Creational.Builder;
    import java.util.List;

class Burrito {
  final List<String> proteinsUsed;
  private Burrito(List<String> proteinsUsed) {
    this.proteinsUsed = proteinsUsed;
  }
  static class BurritoBuilder {

    List<String> proteins;
    public BurritoBuilder addProtein(String protein) {
      proteins.add(protein);
      return this;
    }

    public Burrito build() {
      return new Burrito(proteins);
    }
  }

  private void main() {
      Burrito burritoObject = new Burrito.BurritoBuilder()
          .addProtein("chicken")
          .build();
  }

}

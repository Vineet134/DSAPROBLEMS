class Solution {

    // Global variable
    int index = 0;

    public String countOfAtoms(String formula) {
     
        Map<String, Integer> finalMap = parseFormula(formula);


        TreeMap<String, Integer> sortedMap = new TreeMap<>(finalMap);

     
        StringBuilder ans = new StringBuilder();
        for (String atom : sortedMap.keySet()) {
            ans.append(atom);
            if (sortedMap.get(atom) > 1) {
                ans.append(sortedMap.get(atom));
            }
        }

        return ans.toString();
    }


    private Map<String, Integer> parseFormula(String formula) {

        Map<String, Integer> currMap = new HashMap<>();

      
        while (index < formula.length() && formula.charAt(index) != ')') {
     
            if (formula.charAt(index) == '(') {
                index++;
                Map<String, Integer> nestedMap = parseFormula(formula);
                for (String atom : nestedMap.keySet()) {
                    currMap.put(
                        atom,
                        currMap.getOrDefault(atom, 0) + nestedMap.get(atom)
                    );
                }
            }
  
            else {
                StringBuilder currAtom = new StringBuilder();
                currAtom.append(formula.charAt(index));
                index++;
                while (
                    index < formula.length() &&
                    Character.isLowerCase(formula.charAt(index))
                ) {
                    currAtom.append(formula.charAt(index));
                    index++;
                }

                StringBuilder currCount = new StringBuilder();
                while (
                    index < formula.length() &&
                    Character.isDigit(formula.charAt(index))
                ) {
                    currCount.append(formula.charAt(index));
                    index++;
                }

                if (currCount.length() == 0) {
                    currMap.put(
                        currAtom.toString(),
                        currMap.getOrDefault(currAtom.toString(), 0) + 1
                    );
                } else {
                    currMap.put(
                        currAtom.toString(),
                        currMap.getOrDefault(currAtom.toString(), 0) +
                        Integer.parseInt(currCount.toString())
                    );
                }
            }
        }

        index++;
        StringBuilder multiplier = new StringBuilder();
        while (
            index < formula.length() && Character.isDigit(formula.charAt(index))
        ) {
            multiplier.append(formula.charAt(index));
            index++;
        }
        if (multiplier.length() > 0) {
            int mult = Integer.parseInt(multiplier.toString());
            for (String atom : currMap.keySet()) {
                currMap.put(atom, currMap.get(atom) * mult);
            }
        }

        return currMap;
    }
}
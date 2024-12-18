package personal_notes.primitive_vs_reference_values;

public class values {
    public static void main(String[] args){
        // Demonstrating all 8 Primitive Types

        // 1. byte: 8-bit integer
        byte byteValue = 127; // Maximum value for byte
        System.out.println("byte value: " + byteValue);

        // 2. short: 16-bit integer
        short shortValue = 32000; // Example short value
        System.out.println("short value: " + shortValue);

        // 3. int: 32-bit integer
        int intValue = 100000; // Example int value
        System.out.println("int value: " + intValue);

        // 4. long: 64-bit integer
        long longValue = 10000000000L; // Example long value
        System.out.println("long value: " + longValue);

        // 5. float: 32-bit floating-point
        float floatValue = 3.14f; // Float values must have 'f' suffix
        System.out.println("float value: " + floatValue);

        // 6. double: 64-bit floating-point
        double doubleValue = 3.14159265359; // Example double value
        System.out.println("double value: " + doubleValue);

        // 7. char: 16-bit Unicode character
        char charValue = 'A'; // Example char value
        System.out.println("char value: " + charValue);

        // 8. boolean: true or false
        boolean booleanValue = true; // Example boolean value
        System.out.println("boolean value: " + booleanValue);

        // Demonstrating "Pass-by-Value"
        int originalValue = 42;
        System.out.println("Original value before method call: " + originalValue);
        modifyValue(originalValue);
        System.out.println("Original value after method call: " + originalValue); // Unchanged
    }
    public static void modifyValue(int value) {
        value = 100; // This change will not affect the original variable
    }
    
}

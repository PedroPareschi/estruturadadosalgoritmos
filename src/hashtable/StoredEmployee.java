package hashtable;

import utils.Employee;

public record StoredEmployee(
        String key,
        Employee value
) {
}

import stream_practice.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//1.         Finding even numbers
        StreamPractice1.execute();

// 2.       Finding max element
        StreamFindMax.execute();

// 3.       Sort a list
        StreamSortList.execute();

// 4.       Count_Strings_with_Specific_Prefix
        Count_Strings_with_Specific_Prefix.execute();

// 5.       Find First Non-Repeated Character in a String
        Non_Repeated_Character_in_a_String.execute();

//6.        Convert List of Strings to Uppercase
        Convert_List_of_Strings_to_Uppercase.execute();

//7.      Sum_of_Numbers_in_a_List
          Sum_of_Numbers_in_a_List.execute();

//8.      Check_if_Any_String_Matches_a_Condition
          Check_if_Any_String_Matches_a_Condition.execute();

//9.      Find Duplicates
          Find_duplicates.execute();

//10.     Group_Strings_by_Length
          Group_Strings_by_Length.execute();

//11.     Flatten_a_List_of_Lists
          Flatten_a_List_of_Lists.execute();

//12.     Concatenate_Strings
          Concatenate_Strings.execute();

//13.     Find_the_longest_string_in_a_list
          Find_the_longest_string_in_a_list.execute();

//14.     Count_Frequency_of_Characters_in_a_String
          Count_Frequency_of_Characters_in_a_String.execute();

//15.     Find_numbers_starting_with_specific_digit
          Find_numbers_starting_with_specific_digit.execute();

//16.   Find_elements_that_appear_exactly_once
        Find_elements_that_appear_exactly_once.execute();

//17.   Sort_a_list_of_objects_by_salary
        Sort_a_list_of_objects_by_salary.execute();

//18.   Group_employees_by_department
        Group_employees_by_department.execute();

//19.   Convert_list_to_map_handle_duplicates
        Convert_list_to_map_handle_duplicates.execute();

//20.   Check_if_list_contain_any_even_number
        Check_if_list_contain_any_even_number.execute();


//21.   Average_of_numbers
        Average_of_numbers.execute();

//22.   Remove_nulls
        Remove_nulls.execute();

//23.   Parallel_stream_example
        Parallel_stream_example.execute();

//24.   Second_highest_number
        Second_highest_number.execute();

//25.   CheckAnagram
        CheckAnagram.isAnagram("JalaJ","ajlaJ");

//26.   Find Palindrommic String
        PalindromicStrings.findPalindromicStrings(Arrays.asList("radar", "level", "world", "java"));

//27. Partition By Even & Odd Values
       PartitionTheListByValues.execute();

//28.   Reverse each string in a list.
        ReverseStrings.execute();

//29. Compute Cartesian Product of Two Lists
        CartesianProduct.execute();

//30. Find median of the list 
        FindMedian.execute();

//31. Group Employees by Department and Age
        GroupEmployeesByDepartmentAndAge.execute();

//32.  Highest_paid_Employee_In_Each_Department
       Highest_paid_Employee_In_Each_Department.execute();


    }
}
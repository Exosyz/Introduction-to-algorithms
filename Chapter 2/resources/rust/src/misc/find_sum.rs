use std::collections::HashMap;

fn find_sum(a: &[i32], x: i32) -> Vec<i32> {
    let mut map: HashMap<i32, i32> = HashMap::new();
    for i in 0..a.len() {
        let remainder = x - a[i];
        if let Some(remainder_key) = map.get(&remainder) {
            return vec![remainder_key.clone(), i as i32];
        }
        map.insert(a[i], i as i32);
    }
    vec![]
}

#[cfg(test)]
mod tests {
    #[test]
    fn insertion_sort() {
        let array = [31, 41, 59, 26, 41, 58];


        assert_eq!([0, 2], super::find_sum(&array, 90).as_slice());
        assert_eq!(Vec::<i32>::new(), super::find_sum(&array, 110).as_slice());
    }
}
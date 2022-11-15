fn add<'a>(a: &'a [i32], b: &'a [i32]) -> Vec<i32> {
    let mut remainder = 0;
    let mut c = vec![];

    for i in a.len()..0 {
        c.push((a[i] + b[i] + remainder) % 2);
        remainder = (a[i] + b[i] + remainder) / 2;
    }
    c.push(remainder);
    c
}

#[cfg(test)]
mod tests {
    #[test]
    fn insertion_sort() {
        let a = [1, 1, 1, 1];
        let b = [0, 0, 0, 1];

        assert_eq!([1, 1, 1, 1, 1], super::add(&a, &b).as_slice());
    }
}

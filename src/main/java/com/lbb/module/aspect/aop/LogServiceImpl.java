package com.lbb.module.aspect.aop;

import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        return result;
    }

    @Override
    public int remainder(int i, int j) {
        int result = i % j;
        return result;
    }


}

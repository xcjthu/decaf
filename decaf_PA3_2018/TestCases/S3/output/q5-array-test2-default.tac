VTABLE(_Main) {
    <empty>
    Main
}

FUNCTION(_Main_New) {
memo ''
_Main_New:
    _T0 = 4
    parm _T0
    _T1 =  call _Alloc
    _T2 = VTBL <_Main>
    *(_T1 + 0) = _T2
    return _T1
}

FUNCTION(main) {
memo ''
main:
    _T4 = "pa1"
    _T5 = 2
    _T6 = 0
    _T7 = (_T5 < _T6)
    if (_T7 == 0) branch _L10
    _T8 = "Decaf runtime error: The length of the created array should not be less than 0.\n"
    parm _T8
    call _PrintString
    call _Halt
_L10:
    _T9 = 0
    _T10 = (_T5 < _T9)
    if (_T10 == 0) branch _L11
    _T11 = "Decaf runtime error: The length of the created array should not be less than 0.\n"
    parm _T11
    call _PrintString
    call _Halt
_L11:
    _T12 = 4
    _T13 = (_T12 * _T5)
    _T14 = (_T12 + _T13)
    parm _T14
    _T15 =  call _Alloc
    *(_T15 + 0) = _T5
    _T16 = 0
    _T15 = (_T15 + _T14)
_L12:
    _T14 = (_T14 - _T12)
    if (_T14 == 0) branch _L13
    _T15 = (_T15 - _T12)
    *(_T15 + 0) = _T16
    branch _L12
_L13:
    _T17 = 0
    _T18 = 1
_L15:
    _T19 = (_T17 < _T5)
    if (_T19 == 0) branch _L14
    _T20 = 4
    _T21 = (_T17 * _T20)
    _T22 = (_T15 + _T21)
    *(_T22 + 0) = _T4
    _T17 = (_T17 + _T18)
    branch _L15
_L14:
    _T3 = _T15
    _T24 = 0
    _T25 = "pa2"
    _T27 = *(_T3 - 4)
    _T28 = (_T24 < _T27)
    if (_T28 == 0) branch _L16
    _T29 = 0
    _T30 = (_T24 < _T29)
    if (_T30 == 0) branch _L17
_L16:
    _T26 = _T25
    branch _L18
_L17:
    _T31 = 4
    _T32 = (_T24 * _T31)
    _T33 = (_T3 + _T32)
    _T34 = *(_T33 + 0)
    _T26 = _T34
_L18:
    _T23 = _T26
    _T36 = 2
    _T37 = "pa3"
    _T39 = *(_T3 - 4)
    _T40 = (_T36 < _T39)
    if (_T40 == 0) branch _L19
    _T41 = 0
    _T42 = (_T36 < _T41)
    if (_T42 == 0) branch _L20
_L19:
    _T38 = _T37
    branch _L21
_L20:
    _T43 = 4
    _T44 = (_T36 * _T43)
    _T45 = (_T3 + _T44)
    _T46 = *(_T45 + 0)
    _T38 = _T46
_L21:
    _T35 = _T38
    parm _T23
    call _PrintString
    parm _T35
    call _PrintString
}


package com.mastermind.daggerhilt.model

import javax.inject.Inject

class Mobile @Inject constructor(var battery : Battery, var processor : Processor){

}